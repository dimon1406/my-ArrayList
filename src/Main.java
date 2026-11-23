class Main{
    public static void main(String[] args){
        ArList<Integer> list = new ArList<>();

        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);

        System.out.println(list);
        System.out.println(list.get(3));

        try{
            System.out.println(list.get(7));
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println(list.size());
    }
}