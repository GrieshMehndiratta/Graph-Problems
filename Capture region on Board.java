public class Solution {

    public void dfs(ArrayList<ArrayList<Character>> a ,int i,int j)
    {

        if(i<0 || i>=a.size() || j<0 || j>=a.get(0).size())

            return;

        if(a.get(i).get(j) != 'O')

            return;

            
	a.get(i).set(j,'U');

        dfs(a,i-1,j);

        dfs(a,i+1,j);

        dfs(a,i,j-1);

        dfs(a,i,j+1);

    }
    
    public void solve(ArrayList<ArrayList<Character>> a) {

        int r =a.size();

        int c =a.get(0).size()-1;

        for(int i=0;i<r;i++)

            if(a.get(i).get(0)=='O')

                dfs(a,i,0);

      
      for(int j=0;j<=c;j++)

            	if(a.get(0).get(j)=='O')

        	        dfs(a,0,j);

            
	for(int i=0;i<r;i++)
    
             if(a.get(i).get(c)=='O')

	                dfs(a,i,c);


        for(int j=0;j<=c;j++)
       
            if(a.get(r-1).get(j)=='O')

	                dfs(a,r-1,j);



        for(int i=0;i<a.size() ;i++)

        {

            for(int j=0;j<a.get(0).size() ;j++)

            {

                if(a.get(i).get(j)=='O')

                {

                    a.get(i).set(j,'X');

                }

                else if(a.get(i).get(j)=='U')

                {

                    a.get(i).set(j,'O');

                }

            }

        }

    }

}
