public class Question implements Complexity {
  
  private String question, answer;
  private int complexityLevel;
  
  //Constructor: Sets up the question with a default complexity.
  public Question (String query, String result) {
    question = query;
    answer = result;
    complexityLevel = 1; }
  
  //Sets the complexity level
  public void setComplexity (int level){
    complexityLevel = level; }

  //  Returns the complexity level
  public int getComplexity() {
    return complexityLevel; }

  //  Returns the question.    
  public String getQuestion(){
     return question;
  }
  
  //Returns answer
  public String getAnswer() {
    return answer; }

  //  Returns true if the candidate answer matches the answer. 
  public boolean answerCorrect (String candidateAnswer)  {
    return answer.equals(candidateAnswer); }

  //  Returns this question (and its answer) as a string.      
  public String toString() {
    return question + "\n" + answer; }
}
