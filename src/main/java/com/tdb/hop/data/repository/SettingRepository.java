package com.tdb.hop.data.repository;

import org.springframework.data.repository.CrudRepository;
import com.tdb.hop.data.entity.Setting;
import org.springframework.stereotype.Repository;

public interface SettingRepository extends CrudRepository <Setting, String> {

}
