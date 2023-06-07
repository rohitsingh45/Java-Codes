#include<stdio.h>
#include<stdlib.h>
struct node* newNode(int item);
struct node* insert(struct node* node, int data);
void leafSum( struct node *root, int *sum);

struct node {
    int data;
    struct node *left, *right;
};

int sum=0;

int main()
{
    struct node* root = NULL;
    root = insert(root, 50);
    insert(root, 30);
    insert(root, 20);
    insert(root, 40);
    insert(root, 70);
    insert(root, 60);
    insert(root, 80);
 

leafSum(root,&sum);
 
printf("%d", sum);
    return 0;
}


// A  function to create a new BST node
struct node* newNode(int item)
{
    struct node* temp
        = (struct node*)malloc(sizeof(struct node));
    temp->data = item;
    temp->left = temp->right = NULL;
    return temp;
}

struct node* insert(struct node* node, int data)
{
    /* If the tree is empty, return a new node */
    if (node == NULL)
        return newNode(data);
 
    /* Otherwise, recur down the tree */
    if (data < node->data)
        node->left = insert(node->left, data);
    else if (data > node->data)
        node->right = insert(node->right, data);
 
    /* return the (unchanged) node pointer */
    return node;
}


void leafSum(struct node *root, int *sum){
    if (!root)
        return ;
    if (!root->left && !root->right)
        *sum += root->data;
    leafSum(root->left, sum);
    leafSum(root->right, sum);
}