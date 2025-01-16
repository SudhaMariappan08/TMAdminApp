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
    date = "2025-01-13T20:13:00+0530",
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
