#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node* next;
};

struct node* create(struct node* start)
{
	printf("\nEnter the number of elements");
	int n;
	scanf("%d",&n);
	for(int i=0;i<n;i++)
	{
		if(start==NULL)
		{
			start=(struct node*)malloc(sizeof(struct node));
			scanf("%d",&start->data);
			start->next=NULL;
		}
		else
		{
			struct node* ptr=start;
			while(ptr->next!=NULL)
			{
				ptr=ptr->next;
			}
			struct node* temp=(struct node*)malloc(sizeof(struct node));
			scanf("%d",&temp->data);
			temp->next=NULL;
			ptr->next=temp;
		}
	}
	return start;
}
void display(struct node* start)
{
	struct node* ptr=start;
	while(ptr!=NULL)
	{
		printf("\n%d",ptr->data);
		ptr=ptr->next;
	}
}

struct node* removeDup(struct node* start)
{
	struct node* ptr=start->next;
	struct node* check=start;
	
	while(ptr!=NULL)
	{
		check=start;
		while(check!=ptr)
		{
			if(check->data==ptr->data)
			{
				struct node* temp=start;
				struct node* temp2=ptr;
				
				while(temp->next!=ptr)
				{
					temp=temp->next;
				}
				
				temp->next=temp2->next;
				temp2->next=NULL;
				free(temp2);
				ptr=temp;
			}
			check=check->next;
		}
		ptr=ptr->next;
	}
	return start;
}
				
int main()
{
	struct node* start=NULL;
	start=create(start);
	start=removeDup(start);
	display(start);
	return 0;
}