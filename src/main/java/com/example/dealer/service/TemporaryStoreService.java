package com.example.dealer.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import com.example.dealer.model.Dealer;

@Service
public class TemporaryStoreService {
	private final Map<String, List<Dealer>> temporaryFpsStore = new ConcurrentHashMap<>();

    public void storeFpsData(String mobileNo, List<Dealer> fpsData) {
        temporaryFpsStore.put(mobileNo, fpsData);
        scheduleDataExpiration(mobileNo, 5, TimeUnit.MINUTES);
    }

    public List<Dealer> getFpsData(String mobileNo) {
        return temporaryFpsStore.get(mobileNo);
    }

    public void clearFpsData(String mobileNo) {
        temporaryFpsStore.remove(mobileNo);
    }

    private void scheduleDataExpiration(String mobileNo, long delay, TimeUnit unit) {
        Runnable task = () -> temporaryFpsStore.remove(mobileNo);
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.schedule(task, delay, unit);
        scheduler.shutdown(); 
    }
}
