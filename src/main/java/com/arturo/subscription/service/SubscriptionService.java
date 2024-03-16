package com.arturo.subscription.service;

import com.arturo.subscription.entity.SubscriptionEntity;
import com.arturo.subscription.repository.SubscriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    public List<SubscriptionEntity> findAll(){
        return subscriptionRepository.findAll();
    }
}
