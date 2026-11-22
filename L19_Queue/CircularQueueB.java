public class CircularQueueB {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // isEmpty
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // isFull
        public boolean isFull() {
            return (rear + 1) % size == front;  // when (rear+1)%size == front then it is full queue
        }

        // add -> O(1)
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full.");
                return;
            }

            // add 1st element
            if(front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove -> O(1) -> not using loop in this approach
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int result = arr[front];
            
            // last element delete
            if(rear == front) {
                rear = front = -1;
            } else {
                front = (front+1) % size;
            }
    
            return result;
        }

        // peek -> O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        // [1] [2] [3]

        // // this line should return "Queue is full"
        // q.add(4);   

        System.out.println(q.remove()); // [ ] [2] [3]
        q.add(4);   // [4] [2] [3]
        System.out.println(q.remove()); // [4] [ ] [3]
        q.add(5);   // [4] [5] [3] where 5 -> rear & 3 -> front
        System.out.println();

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
