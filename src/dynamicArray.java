public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

    List<List<Integer>> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
        list.add(new ArrayList<>());
    }

    List<Integer> result = new ArrayList<>();

    int lastAnswer = 0;

    for (List<Integer> a : queries) {

        int type = a.get(0);
        int x = a.get(1);
        int y = a.get(2);

        int idx = (x ^ lastAnswer) % n;

        if (type == 1) {

            list.get(idx).add(y);

        } else {

            lastAnswer = list.get(idx)
                             .get(y % list.get(idx).size());

            result.add(lastAnswer);
        }
    }

    return result;
}
