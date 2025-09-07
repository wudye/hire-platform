package com.mwu.service.impl;

import com.mwu.entity.Stu;
import com.mwu.repository.StuRepository;
import com.mwu.service.StuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StuServiceImpl implements StuService {

    private final StuRepository stuRepository;

    @Override
    public void saveStu(Stu stu) {
        Optional<Stu> optionalStu = stuRepository.findByName(stu.getName());
        if (optionalStu.isPresent()) {
//            throw new RuntimeException("Stu already exists");
            return;
        }
        stuRepository.save(stu);
    }
}
