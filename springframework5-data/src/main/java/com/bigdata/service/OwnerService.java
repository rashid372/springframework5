package com.bigdata.service;

import com.bigdata.model.Owner;

import java.util.Set;

public interface OwnerService extends CurdService<Owner,Long> {
    Owner findByLastName(String lastName);
}
