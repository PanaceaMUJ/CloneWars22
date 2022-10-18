#include <stdio.h>
#include <stdlib.h>
struct node{
    int data;
    struct node *next;
};
void enqueue(struct node **);
void dequeue(struct node **);
void display(struct node *);
void peek(struct node *);

int main(){
    struct node *front=0,*rear=0;
    int choice;
    printf("Press 1 for Enqueue\nPress 2 for Dequeue\nPress 3 for Display\nPress 4 for Peek\nPress 5 for Exit\n");
    do{
        printf("\nEnter your choice: ");
        scanf("%d",&choice);
        switch(choice){
            case 1: enqueue(&rear);
            if(front==0){
                front=rear;
            }
            break;
           
            case 2: if(front==0 && rear==0){
                printf("Queue is Empty");
                break;
            }
            else{
                dequeue(&front);
                if(front==0){
                    rear=0;
                }
                break;
            }

            case 3: if(front==0){
                printf("Queue is Empty");
                break;
            }
            else{
                display(front);
                break;
            }

            case 4: if(front==0){
                printf("Queue is Empty");
                break;
            }
            else{
                peek(front);
                break;
            }

            case 5: break;
            default: printf("Invalid Choice");
        }
    }while(choice!=5);
}
void enqueue(struct node **rear){
    struct node *newnode;
    newnode=(struct node*)malloc(sizeof(struct node));
    printf("Enter the data: ");
    scanf("%d",&newnode->data);
    newnode->next=0;
    if((*rear)==0){
        (*rear)=newnode;
    }
    else{
        (*rear)->next=newnode;
        (*rear)=newnode;
    }
}
void dequeue(struct node **front){
    struct node *temp=(*front);
    printf("The dequeued element is %d",(*front)->data);
    (*front)=(*front)->next;
    free(temp);
}
void display(struct node *front){
    struct node *temp=front;
    printf("The elements in the stack are: ");
    while(temp!=0){
        printf("%d ",temp->data);
        temp=temp->next;
    }
}
void peek(struct node *front){
    printf("The top most element is %d",front->data);

}
