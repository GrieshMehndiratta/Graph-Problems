public class Solution {

    public void dfs(ArrayList<String> A,int i,int j) {

        if(i>=A.size() || i<0 || j>=A.get(0).length() || j<0)

            return;

        if(A.get(i).charAt(j) != 'X')

            return;

        
String line = A.get(i);

        StringBuilder newline = new StringBuilder(line);

        newline.setCharAt(j,'0');

        A.set(i,newline.toString());

        dfs(A,i,j+1);

        dfs(A,i+1,j);

        dfs(A,i-1,j);

        dfs(A,i,j-1);

    }

    public int black(ArrayList<String> A) {

        int r=0;

        for(int i=0;i<A.size();i++)

        {
            
		for(int j=0;j<A.get(i).length();j++)

            	{

	                if(A.get(i).charAt(j)=='X')
	
                {
	
                    dfs(A,i,j);
	
                    r++;
	
                }

            	}

        }
        
	return r;

    }

}
