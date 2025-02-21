package com.example.DorminatoryManagement.controller;

import com.example.DorminatoryManagement.entity.UtilityService;
import com.example.DorminatoryManagement.service.UtilityServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
@RequiredArgsConstructor
public class UtilityServiceController {

    private final UtilityServiceService serviceService;

    // Lấy danh sách tất cả dịch vụ
    @GetMapping
    public ResponseEntity<List<UtilityService>> getAllServices() {
        List<UtilityService> services = serviceService.getAllServices();
        return ResponseEntity.ok(services);
    }

    // Lấy dịch vụ theo ID
    @GetMapping("/{id}")
    public ResponseEntity<UtilityService> getServiceById(@PathVariable Integer id) {
        UtilityService service = serviceService.getServiceById(id);
        return service != null ? ResponseEntity.ok(service) : ResponseEntity.notFound().build();
    }

    // Tạo dịch vụ mới
    @PostMapping
    public ResponseEntity<UtilityService> createService(
            @RequestParam String serviceName,
            @RequestParam String description,
            @RequestParam Double pricePerUnit,
            @RequestParam String calculationUnit) {
        UtilityService service = serviceService.createService(serviceName, description, pricePerUnit, calculationUnit);
        return ResponseEntity.ok(service);
    }

    // Cập nhật dịch vụ
    @PutMapping("/{id}")
    public ResponseEntity<UtilityService> updateService(
            @PathVariable Integer id,
            @RequestParam String serviceName,
            @RequestParam String description,
            @RequestParam Double pricePerUnit,
            @RequestParam String calculationUnit) {
        UtilityService updatedService = serviceService.updateService(id, serviceName, description, pricePerUnit, calculationUnit);
        return updatedService != null ? ResponseEntity.ok(updatedService) : ResponseEntity.notFound().build();
    }

    // Xóa dịch vụ
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteService(@PathVariable Integer id) {
        serviceService.deleteService(id);
        return ResponseEntity.noContent().build();
    }
}
