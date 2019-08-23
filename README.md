# Immutable Queue

Immutable Queue implementation using the following interface:

```
public interface Queue<T> {
    public Queue<T> enQueue(T t);
    public Queue<T> deQueue();
    public T head();
    public boolean isEmpty();
}
```
## Usage

Input consists of q queries, where each query is one of the following 3 types:

1 x: Enqueue element x into the end of the queue.

2: Dequeue element at the front of the queue.

3: Print the element at the front of the queue (null if queue is empty).

**Example 1**

Input:
```
8
1 5
1 10
1 15
1 20
2
2
2
3
```
Output: 
```
20
```

**Example 2**

Input:
```
5
1 a
1 b
2
1 c
3
```

Output:
```
b
```
