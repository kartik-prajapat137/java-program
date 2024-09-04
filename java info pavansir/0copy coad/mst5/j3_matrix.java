package mst5;

public class j3_matrix {
    // int arr[][]={{1,2,3,4,5},{6,7,8,9,10,},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
    // int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    // ,{6,7,8,9,10},{11,12,13,14,15}
    // if(arr.length>arr[0].length)
    public static void main(String[] args) {
        int arr[][]={{1},{2},{3}};
        int a=0,b=arr[0].length-1,c=arr.length-1,n;
        if(arr.length==1||arr.length==2||arr[0].length==1||arr[0].length==2){
            n=1;
        }else {
            if(arr.length<arr[0].length){
                n=(arr.length+1)/2;
            }else {
                n=(arr[0].length+1)/2;
            }
        }int last=0,l2=0;
        boolean column=false,row=false;
        if(arr.length<arr[0].length && (arr.length)%2!=0){
            row=true;
            // last=2;
        }else if(arr[0].length<arr.length&&(arr[0].length)%2!=0){
            column=true;
            // last=1;
        }

        // }else if(arr.length)
        System.out.println((arr.length+1)/2+" n "+n);
        ///////////////////////////////////////////////
        for(int i=1; i<=n; i++){

            for(int j=1; j<=4; j++){
            // System.out.println("\n"+i);
            if(i==n){
                if(column){
                    System.out.println("colum");
                    // j=2+last;
                    // last++;
                    // ++l2;
                    // if(l2==3)
                    // break;
                }else if(row){
                    System.out.println("row");
                    if(j==3)
                    break;
                }
            }
                if(j==1){
                    for(int k=a; k<b; k++){
                        System.out.print(arr[a][k]+" ");
                    }
                }else if(j==2){
                    for(int k=a; k<c; k++){
                        System.out.print(arr[k][b]+" ");
                    }
                }else if(j==3){
                    for(int k=b; k>a; k--){
                        System.out.print(arr[c][k]+" ");
                        // System.out.print(arr[c][k]+" ");
                    }
                }else if(j==4){
                    for(int k=c; k>a; k--){
                        System.out.print(arr[k][a]+" ");
                    }
                }
            }
            // System.out.println();
            if(i==n&&a==b&&b==c){
                System.out.print(arr[a][b]+" ");
                break;
            }
            ++a;
            --b;
            --c;
        }
    }
}
