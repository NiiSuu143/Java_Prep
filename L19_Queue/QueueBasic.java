public class QueueBasic {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isEmpty
        public boolean isEmpty() {
            return rear == -1;
        }

        // add -> O(1)
        public void add(int data) {
            if(rear == size-1) {
                System.out.println("Queue is full.");
                return ;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        // remove -> O(n)
        public int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = arr[0];
            // need to shift from i+1 to i
            for(int i=0; i<rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--; // 1 element is removed so. rear--
            return front;
        }

        // peek -> O(1)
        public int peek() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = arr[0];
            return front;
        }
    }
    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}