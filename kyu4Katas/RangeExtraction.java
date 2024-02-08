class Solution {
		public static String rangeExtraction(int[] arr) {
    		StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i];
            int end = arr[i];
            
            // Check for consecutive elements
            while (i < arr.length - 1 && arr[i] + 1 == arr[i + 1]) {
                end = arr[i + 1];
                i++;
            }
            
            if (result.length() > 0) {
                result.append(",");
            }
            
            if (start == end) {
                result.append(start);
            } else if (end - start == 1) {
                result.append(start).append(",").append(end);
            } else {
                result.append(start).append("-").append(end);
            }
        }

        return result.toString();
    }
}
