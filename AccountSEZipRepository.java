package com.aexp.esi.esiapi.dao;

import com.aexp.esi.esiapi.controller.AccountSE;
import com.aexp.esi.esiapi.controller.AccountSEMapper;
import com.aexp.esi.esiapi.controller.AccountSEZip;
import com.aexp.esi.esiapi.controller.AccountSEZipMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AccountSEZipRepository {

    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly=true)
    public List<AccountSEZip> findAll() {
        return jdbcTemplate.query("select * from acct_se_zip", new AccountSEZipMapper());
    }
}
