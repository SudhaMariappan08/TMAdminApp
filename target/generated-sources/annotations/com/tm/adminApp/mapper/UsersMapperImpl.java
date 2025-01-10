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
    date = "2025-01-10T15:59:23+0530",
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

        users.setId( dto.getId() );
        users.setName( dto.getName() );
        users.setEmail( dto.getEmail() );

        return users;
    }

    @Override
    public UsersDTO toDto(Users entity) {
        if ( entity == null ) {
            return null;
        }

        UsersDTO usersDTO = new UsersDTO();

        usersDTO.setId( entity.getId() );
        usersDTO.setName( entity.getName() );
        usersDTO.setEmail( entity.getEmail() );

        return usersDTO;
    }

    @Override
    public Users updateDtoToEntity(UpdateUsersDTO updateDto) {
        if ( updateDto == null ) {
            return null;
        }

        Users users = new Users();

        users.setId( updateDto.getId() );
        users.setName( updateDto.getName() );
        users.setEmail( updateDto.getEmail() );

        return users;
    }

    @Override
    public UpdateUsersDTO entitytoUpdateDto(Users entity) {
        if ( entity == null ) {
            return null;
        }

        UpdateUsersDTO updateUsersDTO = new UpdateUsersDTO();

        updateUsersDTO.setId( entity.getId() );
        updateUsersDTO.setName( entity.getName() );
        updateUsersDTO.setEmail( entity.getEmail() );

        return updateUsersDTO;
    }

    @Override
    public Users saveDtoToEntity(SaveUsersDTO saveDto) {
        if ( saveDto == null ) {
            return null;
        }

        Users users = new Users();

        users.setName( saveDto.getName() );
        users.setEmail( saveDto.getEmail() );

        return users;
    }

    @Override
    public SaveUsersDTO entitytoSaveDto(Users entity) {
        if ( entity == null ) {
            return null;
        }

        SaveUsersDTO saveUsersDTO = new SaveUsersDTO();

        saveUsersDTO.setName( entity.getName() );
        saveUsersDTO.setEmail( entity.getEmail() );

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
