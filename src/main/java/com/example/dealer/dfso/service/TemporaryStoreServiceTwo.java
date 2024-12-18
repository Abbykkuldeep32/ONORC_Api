package com.example.dealer.dfso.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import com.example.dealer.dfso.model.Login;

@Service
public class TemporaryStoreServiceTwo {
	private final Map<String, List<Login>> temporaryFpsStore = new ConcurrentHashMap<>();

    public void storeFpsData(String mobileNo, List<Login> dfso) {
        temporaryFpsStore.put(mobileNo, dfso);
        scheduleDataExpiration(mobileNo, 5, TimeUnit.MINUTES);
    }

    public List<Login> getFpsData(String mobileNo) {
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
