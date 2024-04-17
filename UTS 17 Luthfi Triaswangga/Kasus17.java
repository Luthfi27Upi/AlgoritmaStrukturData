public class Kasus17 {
    int[] list;
    Kasus17(int[] arr) {
        list = arr;
    }
    void showAll() {
        System.out.println("Data :");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    void selectionSortASC() {
        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }
            int temp = list[min];
            list[min] = list[i];
            list[i] = temp;
        }
    }
    void selectionSortDESC() {
        for (int i = 0; i < list.length; i++) {
            int max = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] > list[max]) {
                    max = j;
                }
            }
            int temp = list[max];
            list[max] = list[i];
            list[i] = temp;
        }
    }
    int binarySearchASC(int key, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;

            if (key == list[mid]) {
                return mid;
            } else if (key < list[mid]) {
                return binarySearchASC(key, left, mid - 1);
            } else {
                return binarySearchASC(key, mid + 1, right);
            }
        }
        return -1;
    }
    int binarySearchDESC(int key, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (key == list[mid]) {
                return mid;
            } else if (key > list[mid]) {
                return binarySearchDESC(key, left, mid - 1);
            } else {
                return binarySearchDESC(key, mid + 1, right);
            }
        }
        return -1;
    }
    void search(int key) {
        boolean isFound = false;
        int idx = binarySearchASC(key, 0, list.length - 1);
        String description = null;
        if (idx > -1) {
            isFound = true;
            description = "Ascending";
        } else {
            idx = binarySearchDESC(key, 0, list.length - 1);
            if (idx > -1) {
                isFound = true;
                description = "Descending";
            }
        }
        if (isFound) {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("Data Ditemukan");
            System.out.println("Methode yang digunakan  : " + description);
            System.out.println("Nomer                  : " + list[idx]);
            System.out.println("Index                  : " + idx);
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        } else {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("Data Tidak Ditemukan");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        }
    }
}