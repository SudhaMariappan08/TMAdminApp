package com.tm.adminApp.mapper;

import com.tm.adminApp.dto.AdminDTO;
import com.tm.adminApp.dto.SaveAdminDTO;
import com.tm.adminApp.dto.UpdateAdminDTO;
import com.tm.adminApp.entity.Admin;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-10T15:59:23+0530",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 17 (Eclipse Adoptium)"
)
@Component
public class AdminMapperImpl implements AdminMapper {

    @Override
    public Admin toEntity(AdminDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Admin admin = new Admin();

        admin.setId( dto.getId() );
        admin.setName( dto.getName() );
        admin.setEmail( dto.getEmail() );

        return admin;
    }

    @Override
    public AdminDTO toDto(Admin entity) {
        if ( entity == null ) {
            return null;
        }

        AdminDTO adminDTO = new AdminDTO();

        adminDTO.setId( entity.getId() );
        adminDTO.setName( entity.getName() );
        adminDTO.setEmail( entity.getEmail() );

        return adminDTO;
    }

    @Override
    public Admin updateDtoToEntity(UpdateAdminDTO updateDto) {
        if ( updateDto == null ) {
            return null;
        }

        Admin admin = new Admin();

        admin.setId( updateDto.getId() );
        admin.setName( updateDto.getName() );
        admin.setEmail( updateDto.getEmail() );

        return admin;
    }

    @Override
    public UpdateAdminDTO entitytoUpdateDto(Admin entity) {
        if ( entity == null ) {
            return null;
        }

        UpdateAdminDTO updateAdminDTO = new UpdateAdminDTO();

        updateAdminDTO.setId( entity.getId() );
        updateAdminDTO.setName( entity.getName() );
        updateAdminDTO.setEmail( entity.getEmail() );

        return updateAdminDTO;
    }

    @Override
    public Admin saveDtoToEntity(SaveAdminDTO saveDto) {
        if ( saveDto == null ) {
            return null;
        }

        Admin admin = new Admin();

        admin.setName( saveDto.getName() );
        admin.setEmail( saveDto.getEmail() );

        return admin;
    }

    @Override
    public SaveAdminDTO entitytoSaveDto(Admin entity) {
        if ( entity == null ) {
            return null;
        }

        SaveAdminDTO saveAdminDTO = new SaveAdminDTO();

        saveAdminDTO.setName( entity.getName() );
        saveAdminDTO.setEmail( entity.getEmail() );

        return saveAdminDTO;
    }

    @Override
    public List<AdminDTO> entityListToDTOList(List<Admin> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AdminDTO> list = new ArrayList<AdminDTO>( entityList.size() );
        for ( Admin admin : entityList ) {
            list.add( toDto( admin ) );
        }

        return list;
    }

    @Override
    public List<Admin> dtoListToEntityList(List<AdminDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Admin> list = new ArrayList<Admin>( dtoList.size() );
        for ( AdminDTO adminDTO : dtoList ) {
            list.add( toEntity( adminDTO ) );
        }

        return list;
    }
}
