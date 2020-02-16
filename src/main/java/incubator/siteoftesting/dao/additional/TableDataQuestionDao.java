package incubator.siteoftesting.dao.additional;

import incubator.siteoftesting.model.Answer;
import incubator.siteoftesting.model.additional.TableDataQuestion;

import java.util.List;

public interface TableDataQuestionDao {
    List<TableDataQuestion> findDataForQuestions();
}
