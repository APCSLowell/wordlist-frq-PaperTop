import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    /* to be implemented in part (a) */
    int count = 0;
    for (int i = 0; i <myList.size(); i++){
      if (myList.get(i).length() == len){
        count++;
      }
    }
    return count;
  }

  public void removeWordsOfLength(int len)
  {
    /* to be implemented in part (b) */
    ArrayList <string> ans = new ArrayList <string>();
    int index = 0;
    for (int i = 0; i < myList.size(); i++){
      if (myList.get(i).length() != len){
        ans.add(myList.get(i));
      }
  }
  myList = ans;
}
