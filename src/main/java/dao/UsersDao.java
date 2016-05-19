package dao;


import exception.*;
import model.*;

import java.util.List;
import java.util.Set;

public interface UsersDao {

    Users create(long id, String firstName, String secondName, String email, String phoneNumber) throws DAOException;

    Users read(long id) throws DAOException;

    Users update(long id, String email, String firstName, String secondName, String phoneNumber) throws DAOException;

}