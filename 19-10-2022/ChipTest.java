import java.util.ArrayList;
import java.util.List;

public class ChipTest {
    public static List<List<String>> countElement(String element[]){
        List<List<String> > listOfElement = new ArrayList<List<String> >();
        boolean visitedStatus[]= new boolean[element.length];
        for (int i = 0; i < visitedStatus.length; i++) {
            visitedStatus[i] = false;
        }

        for (int i = 0; i < element.length; i++) {
            if(visitedStatus[i] == false){
                List<String> singleElementList= new ArrayList<String>();
                int count = 1;
                for (int j = i+1; j < visitedStatus.length; j++) {
                    if(element[i].equals(element[j])){
                        visitedStatus[j] = true;
                        count++;
                    }
                }
                singleElementList.add(element[i]);
                singleElementList.add(Integer.toString(count));
                listOfElement.add(singleElementList);
                // System.out.println(element[i] + " "+ count + "x");
            }
        }
        return listOfElement;
    }   

    public static void main (String[]args){
        String ingredient = "KKKKKKAAAAAFFFFEEEIYIYI";
        String recipe = "KAFE";
        String ingredientSplit[] = ingredient.split("");
        String recipeSplit[] = recipe.split("");
        
        List<List<String> > listOfElementIngredients = new ArrayList<List<String> >();
        listOfElementIngredients = countElement(ingredientSplit);
        System.out.println(listOfElementIngredients);
        
        List<List<String> > listOfElementRecipe = new ArrayList<List<String> >();
        listOfElementRecipe = countElement(recipeSplit);
        System.out.println(listOfElementRecipe);
        
        boolean stringStatus = true;
        int sum = 0;
      
        while(stringStatus){
            for (int i = 0; i < listOfElementRecipe.size(); i++) {
                for (int j = 0; j < listOfElementIngredients.size(); j++) {
                    if(listOfElementRecipe.get(i).get(0).equals(listOfElementIngredients.get(j).get(0))){
                        if(Integer.parseInt(listOfElementIngredients.get(j).get(1))!=0){
                            stringStatus = true;
                            int temp = Integer.parseInt(listOfElementIngredients.get(i).get(1))-Integer.parseInt(listOfElementRecipe.get(i).get(1)) ;
                            listOfElementIngredients.get(j).set(1, Integer.toString(temp));
                            continue;
                        }else{
                            stringStatus = false;
                            break;
                        }
                    }
                }
            }

            if(stringStatus){
                sum++;
            }
        }
        System.out.println(sum);
        // System.out.println(listOfElementRecipe.get(3).get(0));
    }
}
