package com.tm.adminApp.mapper;

import com.tm.adminApp.dto.SaveUsersDTO;
import com.tm.adminApp.dto.UpdateUsersDTO;
import com.tm.adminApp.dto.UsersDTO;
import com.tm.adminApp.entity.Users;
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
public class UsersMapperImpl implements UsersMapper {

    @Override
    public Users toEntity(UsersDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Users users = new Users();

        if ( dto.getId() != null ) {
            users.setId( dto.getId() );
        }
        if ( dto.getName() != null ) {
            users.setName( dto.getName() );
        }
        if ( dto.getEmail() != null ) {
            users.setEmail( dto.getEmail() );
        }
        if ( dto.getIsDeleted() != null ) {
            users.setIsDeleted( dto.getIsDeleted() );
        }
        if ( dto.getCreatedBy() != null ) {
            users.setCreatedBy( dto.getCreatedBy() );
        }
        if ( dto.getCreatedAt() != null ) {
            users.setCreatedAt( dto.getCreatedAt() );
        }
        if ( dto.getUpdatedBy() != null ) {
            users.setUpdatedBy( dto.getUpdatedBy() );
        }
        if ( dto.getUpdatedAt() != null ) {
            users.setUpdatedAt( dto.getUpdatedAt() );
        }

        return users;
    }

    @Override
    public UsersDTO toDto(Users entity) {
        if ( entity == null ) {
            return null;
        }

        UsersDTO usersDTO = new UsersDTO();

        if ( entity.getId() != null ) {
            usersDTO.setId( entity.getId() );
        }
        if ( entity.getName() != null ) {
            usersDTO.setName( entity.getName() );
        }
        if ( entity.getEmail() != null ) {
            usersDTO.setEmail( entity.getEmail() );
        }
        if ( entity.getIsDeleted() != null ) {
            usersDTO.setIsDeleted( entity.getIsDeleted() );
        }
        if ( entity.getCreatedBy() != null ) {
            usersDTO.setCreatedBy( entity.getCreatedBy() );
        }
        if ( entity.getCreatedAt() != null ) {
            usersDTO.setCreatedAt( entity.getCreatedAt() );
        }
        if ( entity.getUpdatedBy() != null ) {
            usersDTO.setUpdatedBy( entity.getUpdatedBy() );
        }
        if ( entity.getUpdatedAt() != null ) {
            usersDTO.setUpdatedAt( entity.getUpdatedAt() );
        }

        return usersDTO;
    }

    @Override
    public Users updateDtoToEntity(UpdateUsersDTO updateDto, Users entity) {
        if ( updateDto == null ) {
            return entity;
        }

        if ( updateDto.getName() != null ) {
            entity.setName( updateDto.getName() );
        }
        if ( updateDto.getEmail() != null ) {
            entity.setEmail( updateDto.getEmail() );
        }
        if ( updateDto.getIsDeleted() != null ) {
            entity.setIsDeleted( updateDto.getIsDeleted() );
        }
        if ( updateDto.getCreatedBy() != null ) {
            entity.setCreatedBy( updateDto.getCreatedBy() );
        }
        if ( updateDto.getCreatedAt() != null ) {
            entity.setCreatedAt( updateDto.getCreatedAt() );
        }
        if ( updateDto.getUpdatedBy() != null ) {
            entity.setUpdatedBy( updateDto.getUpdatedBy() );
        }
        if ( updateDto.getUpdatedAt() != null ) {
            entity.setUpdatedAt( updateDto.getUpdatedAt() );
        }

        return entity;
    }

    @Override
    public UpdateUsersDTO entitytoUpdateDto(Users entity) {
        if ( entity == null ) {
            return null;
        }

        UpdateUsersDTO updateUsersDTO = new UpdateUsersDTO();

        if ( entity.getId() != null ) {
            updateUsersDTO.setId( entity.getId() );
        }
        if ( entity.getName() != null ) {
            updateUsersDTO.setName( entity.getName() );
        }
        if ( entity.getEmail() != null ) {
            updateUsersDTO.setEmail( entity.getEmail() );
        }
        if ( entity.getIsDeleted() != null ) {
            updateUsersDTO.setIsDeleted( entity.getIsDeleted() );
        }
        if ( entity.getCreatedBy() != null ) {
            updateUsersDTO.setCreatedBy( entity.getCreatedBy() );
        }
        if ( entity.getCreatedAt() != null ) {
            updateUsersDTO.setCreatedAt( entity.getCreatedAt() );
        }
        if ( entity.getUpdatedBy() != null ) {
            updateUsersDTO.setUpdatedBy( entity.getUpdatedBy() );
        }
        if ( entity.getUpdatedAt() != null ) {
            updateUsersDTO.setUpdatedAt( entity.getUpdatedAt() );
        }

        return updateUsersDTO;
    }

    @Override
    public Users saveDtoToEntity(SaveUsersDTO saveDto) {
        if ( saveDto == null ) {
            return null;
        }

        Users users = new Users();

        if ( saveDto.getName() != null ) {
            users.setName( saveDto.getName() );
        }
        if ( saveDto.getEmail() != null ) {
            users.setEmail( saveDto.getEmail() );
        }
        if ( saveDto.getIsDeleted() != null ) {
            users.setIsDeleted( saveDto.getIsDeleted() );
        }
        if ( saveDto.getCreatedBy() != null ) {
            users.setCreatedBy( saveDto.getCreatedBy() );
        }
        if ( saveDto.getCreatedAt() != null ) {
            users.setCreatedAt( saveDto.getCreatedAt() );
        }
        if ( saveDto.getUpdatedBy() != null ) {
            users.setUpdatedBy( saveDto.getUpdatedBy() );
        }
        if ( saveDto.getUpdatedAt() != null ) {
            users.setUpdatedAt( saveDto.getUpdatedAt() );
        }

        return users;
    }

    @Override
    public SaveUsersDTO entitytoSaveDto(Users entity) {
        if ( entity == null ) {
            return null;
        }

        SaveUsersDTO saveUsersDTO = new SaveUsersDTO();

        if ( entity.getName() != null ) {
            saveUsersDTO.setName( entity.getName() );
        }
        if ( entity.getEmail() != null ) {
            saveUsersDTO.setEmail( entity.getEmail() );
        }
        if ( entity.getIsDeleted() != null ) {
            saveUsersDTO.setIsDeleted( entity.getIsDeleted() );
        }
        if ( entity.getCreatedBy() != null ) {
            saveUsersDTO.setCreatedBy( entity.getCreatedBy() );
        }
        if ( entity.getCreatedAt() != null ) {
            saveUsersDTO.setCreatedAt( entity.getCreatedAt() );
        }
        if ( entity.getUpdatedBy() != null ) {
            saveUsersDTO.setUpdatedBy( entity.getUpdatedBy() );
        }
        if ( entity.getUpdatedAt() != null ) {
            saveUsersDTO.setUpdatedAt( entity.getUpdatedAt() );
        }

        return saveUsersDTO;
    }

    @Override
    public List<UsersDTO> entityListToDTOList(List<Users> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<UsersDTO> list = new ArrayList<UsersDTO>( entityList.size() );
        for ( Users users : entityList ) {
            list.add( toDto( users ) );
        }

        return list;
    }

    @Override
    public List<Users> dtoListToEntityList(List<UsersDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Users> list = new ArrayList<Users>( dtoList.size() );
        for ( UsersDTO usersDTO : dtoList ) {
            list.add( toEntity( usersDTO ) );
        }

        return list;
    }
}
