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
    date = "2025-01-16T12:02:05+0530",
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

        if ( dto.getId() != null ) {
            admin.setId( dto.getId() );
        }
        if ( dto.getName() != null ) {
            admin.setName( dto.getName() );
        }
        if ( dto.getEmail() != null ) {
            admin.setEmail( dto.getEmail() );
        }

        return admin;
    }

    @Override
    public AdminDTO toDto(Admin entity) {
        if ( entity == null ) {
            return null;
        }

        AdminDTO adminDTO = new AdminDTO();

        if ( entity.getId() != null ) {
            adminDTO.setId( entity.getId() );
        }
        if ( entity.getName() != null ) {
            adminDTO.setName( entity.getName() );
        }
        if ( entity.getEmail() != null ) {
            adminDTO.setEmail( entity.getEmail() );
        }

        return adminDTO;
    }

    @Override
    public Admin updateDtoToEntity(UpdateAdminDTO updateDto, Admin entity) {
        if ( updateDto == null ) {
            return entity;
        }

        if ( updateDto.getName() != null ) {
            entity.setName( updateDto.getName() );
        }
        if ( updateDto.getEmail() != null ) {
            entity.setEmail( updateDto.getEmail() );
        }

        return entity;
    }

    @Override
    public UpdateAdminDTO entitytoUpdateDto(Admin entity) {
        if ( entity == null ) {
            return null;
        }

        UpdateAdminDTO updateAdminDTO = new UpdateAdminDTO();

        if ( entity.getId() != null ) {
            updateAdminDTO.setId( entity.getId() );
        }
        if ( entity.getName() != null ) {
            updateAdminDTO.setName( entity.getName() );
        }
        if ( entity.getEmail() != null ) {
            updateAdminDTO.setEmail( entity.getEmail() );
        }

        return updateAdminDTO;
    }

    @Override
    public Admin saveDtoToEntity(SaveAdminDTO saveDto) {
        if ( saveDto == null ) {
            return null;
        }

        Admin admin = new Admin();

        if ( saveDto.getName() != null ) {
            admin.setName( saveDto.getName() );
        }
        if ( saveDto.getEmail() != null ) {
            admin.setEmail( saveDto.getEmail() );
        }

        return admin;
    }

    @Override
    public SaveAdminDTO entitytoSaveDto(Admin entity) {
        if ( entity == null ) {
            return null;
        }

        SaveAdminDTO saveAdminDTO = new SaveAdminDTO();

        if ( entity.getName() != null ) {
            saveAdminDTO.setName( entity.getName() );
        }
        if ( entity.getEmail() != null ) {
            saveAdminDTO.setEmail( entity.getEmail() );
        }

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
