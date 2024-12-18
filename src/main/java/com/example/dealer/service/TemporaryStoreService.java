package com.example.dealer.service;

import java.util.HashMap;
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
	private final Map<String, Map<String, Object>> temporaryFpsStore = new ConcurrentHashMap<>();

    public void storeFpsData(String mobileNo, List<?> entityData, String role) {
    	Map<String, Object> store = new HashMap<>();
        store.put("data", entityData);
        store.put("role", role);
        temporaryFpsStore.put(mobileNo, store);
        scheduleDataExpiration(mobileNo, 5, TimeUnit.MINUTES);
    }

    public Map<String, Object> getFpsData(String mobileNo) {
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
