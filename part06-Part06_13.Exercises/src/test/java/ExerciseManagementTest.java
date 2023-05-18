/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

public class ExerciseManagementTest {
    private ExerciseManagement management;
            
    @Before
    public void initialize(){
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseIsEmptyAtTheBeginning() {
        assertEquals(0, management.exerciseList().size());
    }
    @Test
    public void addingExerciseGrowListByOne() {
        management.add("write a test");
        assertEquals(1, management.exerciseList().size());
    }
    @Test
    public void addedExerciseIsInList(){
        management.add("write a test");
        assertTrue(management.exerciseList().contains("write a test"));
    }
    
   @Test
   public void exerciseCanbeMarkedAsCompleted(){
       management.add("New exercise");
       management.markAsCompleted("New Exercise");
       assertTrue(management.isCompleted("New exercise"));
   }

   
}
