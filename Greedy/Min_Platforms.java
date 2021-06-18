class Solution{
    static int findPlatform(int at[], int dt[], int n){
        Arrays.sort(at);
		    Arrays.sort(dt);
	  	  int curNumOfPlatforms = 0;
		    int minNumOfPlatforms = 0;
		    int i = 0, j = 0;
		    while (i<n && j<n) {
			      if (at[i] <= dt[j]) {
				        curNumOfPlatforms++;
				        i++;
			      }
			      else {
				        curNumOfPlatforms--;
				        j++;
			      }
			      minNumOfPlatforms = Math.max(minNumOfPlatforms, curNumOfPlatforms);
		    }
        return minNumOfPlatforms;
    }
}

