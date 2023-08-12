#include <stdio.h>
#include <conio.h>
#define int MAX=5;
int stack[MAX];
int top = -1;
int value;
void push(int n);
void pop();
void peek();
void traverse();
int main()
{

    int ch;
    while (1)
    {

        printf("1.Push opration");
        printf("2.Pop opration");
        printf("3.Peek opration");
        printf("1.Traverse opration");
        printf("Enter your choice");
        scanf("%d", &ch);
        switch (ch)
        {
        case /* constant-expression */ 1:
            printf("Enter the value to push into the stack");
            scanf("%d", &value);
            push(value);
            /* code */
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            peek();
            break ;
            case 4 : traverse();
            break;
        default:
            printf("Invalid choice");

            break;
        }
    }
    void push(int n)
    {
        if (top = MAX - 1)
        {
            print("Stack Overflow");
            break;
        }
        top = top + 1;
        stack[top] = value;
        printf("push operation perform %d value is inserted", value);
    }
    void pop()
    {
        if (top == NULL)
        {
            print("Stack Underflow");
            break;
        }

        value = stack[top];
        top = top - 1;
        printf("pop operation perform %d value is deleted", value);
    }
    void peek()
    {
        if (top == NULL)
        {
            print("Stack Underflow");
            break;
        }

        value = stack[top];

        printf("peek operation perform %d value is present at the top of the stack", value);
    }
    void traverse()
    {
        int i;
        printf("Stack values are ");
        for (i=0; i <= top; i++)
        {
            printf("%d", stack[i]);
        }
    }
}
