class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (Integer n : nums) {
            list.add(n);
        }
        List<List<Integer>> perms = new ArrayList<>();

        calculatePerms(perms, new ArrayList<>(), list);
        return perms;
    }

    public void calculatePerms(List<List<Integer>> permutations, List<Integer> currentPermutation, List<Integer> elementsToPermute) {
        if(elementsToPermute.size() == 0) {
            permutations.add(currentPermutation);
            return;
        }
        for (int i=0;i<elementsToPermute.size();i++) {
            int ele = elementsToPermute.get(i);
            List<Integer> nextPerm = new ArrayList<Integer>(currentPermutation);
            nextPerm.add(ele);
            List<Integer> remainingElements = new ArrayList<Integer>(elementsToPermute);
            remainingElements.remove(i);
            calculatePerms(permutations, nextPerm, remainingElements);
        }    

    }
}
