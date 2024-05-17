package net.javaguide.emsbackend.service;

import net.javaguide.emsbackend.dto.EmployeeDto;
import net.javaguide.emsbackend.mapper.EmployeeMapper;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);

}
