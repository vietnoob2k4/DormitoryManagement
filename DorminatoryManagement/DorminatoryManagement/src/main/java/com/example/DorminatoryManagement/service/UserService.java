package com.example.DorminatoryManagement.service;

import com.example.DorminatoryManagement.entity.User;
import com.example.DorminatoryManagement.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    // Lấy danh sách tất cả người dùng
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Lấy người dùng theo ID
    public Optional<User> getUserById(Integer userId) {
        return userRepository.findById(userId);
    }

    // Thêm mới người dùng
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Cập nhật thông tin người dùng
    public Optional<User> updateUser(Integer id, User updatedUser) {
        return userRepository.findById(id).map(user -> {
            user.setUsername(updatedUser.getUsername());
            user.setPassword(updatedUser.getPassword());
            user.setFullname(updatedUser.getFullname());
            user.setGender(updatedUser.getGender());
            user.setCccd(updatedUser.getCccd());
            user.setPhoneNumber(updatedUser.getPhoneNumber());
            user.setStatus(updatedUser.getStatus());
            user.setUpdatedAt(updatedUser.getUpdatedAt());
            return userRepository.save(user);
        });
    }

    // Xóa người dùng theo ID
    public boolean deleteUser(Integer userId) {
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
            return true;
        }
        return false;
    }
}
