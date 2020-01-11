package incubator.siteoftesting.facmetdto;

public class ModelFactory {

    public Model getModel(String modelType){
        if(modelType == null){
            return null;
        }

        if(modelType.equalsIgnoreCase("Role")){
            return new RoleDTO();
        } else if(modelType.equalsIgnoreCase("User")){
            return new UserDTO();
        } else if(modelType.equalsIgnoreCase("Statistic")){
            return new StatisticDTO();
        } else if(modelType.equalsIgnoreCase("Question")){
            return new QuestionDTO();
        }

        return null;
    }
}
