public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] sp1=version1.split("\\.");//分割
        String[] sp2=version2.split("\\.");
        int length=Math.max(sp1.length,sp2.length);
        for(int i=0;i<length;i++){
            Integer v1=(i<sp1.length)?Integer.parseInt(sp1[i]):0;
            Integer v2=(i<sp2.length)?Integer.parseInt(sp2[i]):0;
            int compare=v1.compareTo(v2);
            if(compare<0)
                return -1;
            if(compare>0)
                return 1;
        }
        return 0;
    }
}
