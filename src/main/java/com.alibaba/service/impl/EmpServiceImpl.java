package com.alibaba.service.impl;

import com.alibaba.dao.IEmpDao;
import com.alibaba.model.Emp;
import com.alibaba.service.IEmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("empService")
public class EmpServiceImpl implements IEmpService {
    @Resource
    private IEmpDao empDao;
    @Override
    public Emp selectEmp(long id) {
        return empDao.selectEmp(id);
    }
}
