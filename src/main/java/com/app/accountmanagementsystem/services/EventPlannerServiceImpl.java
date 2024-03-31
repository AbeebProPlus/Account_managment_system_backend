package com.app.accountmanagementsystem.services;

import com.app.accountmanagementsystem.data.repositories.EventPlannerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventPlannerServiceImpl implements EventPlannerService{
    private final EventPlannerRepository eventPlannerRepository;
}
