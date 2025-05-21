class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        Set<Integer> rows=new HashSet<>();
        Set<Integer> cols=new HashSet<>();
        for(int i=0;i<row;i++){
            //System.out.println(i+" ");
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int m=0;m<row;m++){
            for(int n=0;n<col;n++){
                if(rows.contains(m)){
                    int newrow=row;
                    int newcol=col-1;
                    while(newcol>=0){
                        matrix[m][newcol]=0;
                        newcol-=1;
                    }
                }
                if(cols.contains(n)){
                    int newrow=row-1;
                    int newcol=col;
                    while(newrow>=0){
                        matrix[newrow][n]=0;
                        newrow-=1;
                    }
                }
                
            }
        }

    }
}
