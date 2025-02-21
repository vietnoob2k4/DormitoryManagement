package com.example.DorminatoryManagement.service;

import com.example.DorminatoryManagement.entity.UtilityService;
import com.example.DorminatoryManagement.repository.UtilityServiceRepository;
import com.example.DorminatoryManagement.utils.enumClass.ServiceStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UtilityServiceService {

    private final UtilityServiceRepository serviceRepository;

    public List<UtilityService> getAllServices() {
        return serviceRepository.findAll();
    }

    public UtilityService getServiceById(Integer serviceId) {
        return serviceRepository.findById(serviceId).orElse(null);
    }

    @Transactional
    public UtilityService createService(String serviceName, String description, Double pricePerUnit, String calculationUnit) {
        UtilityService service = new UtilityService();
        service.setServiceName(serviceName);
        service.setDescription(description);
        service.setPricePerUnit(BigDecimal.valueOf(pricePerUnit));

        service.setCalculationUnit(calculationUnit);
        service.setStatus(ServiceStatus.Active);
//        service.setCreatedAt(Timestamp.from(Instant.now()));
//        service.setUpdatedAt(Timestamp.from(Instant.now()));

        return serviceRepository.save(service);
    }

    @Transactional
    public UtilityService updateService(Integer serviceId, String serviceName, String description, Double pricePerUnit, String calculationUnit) {
        Optional<UtilityService> serviceOptional = serviceRepository.findById(serviceId);
        if (serviceOptional.isPresent()) {
            UtilityService service = serviceOptional.get();
            service.setServiceName(serviceName);
            service.setDescription(description);
            service.setPricePerUnit(BigDecimal.valueOf(pricePerUnit));

//            service.setCalculationUnit(calculationUnit);
//            service.setUpdatedAt(Timestamp.from(Instant.now()));

            return serviceRepository.save(service);
        }
        return null;
    }

    @Transactional
    public void deleteService(Integer serviceId) {
        serviceRepository.deleteById(serviceId);
    }
}
