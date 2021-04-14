package com.alibaba.dao;

import com.alibaba.model.Emp;

public interface IEmpDao {
    Emp selectEmp(long id);
}
