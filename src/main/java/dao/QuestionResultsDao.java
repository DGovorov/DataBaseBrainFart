package dao;

import exception.DAOException;
import model.*;

import java.util.*;

/**
 * Created by mystic on 17.05.2016.
 */
public interface QuestionResultsDao {

    List<QuestionResults> getAll() throws DAOException;
}
