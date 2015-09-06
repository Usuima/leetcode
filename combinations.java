public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> each = new ArrayList<>();
    helper(res, each, 1, n, k);
    return res;
}
public void helper(List<List<Integer>> res, List<Integer> each, int pos, int n, int k) {
    if (each.size() == k) {
        res.add(each);
        return;
    }
    for (int i = pos; i <= n; i++) {
        each.add(i);
        helper(res, new ArrayList<>(each), i + 1, n, k);
        each.remove(each.size() - 1);
    }
    return;
}