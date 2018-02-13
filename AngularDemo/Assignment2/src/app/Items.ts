export class Items
{
    userId:number;
    id:number;
    title:string;
    completed:Boolean;
    


    constructor(  userId:number,
        id:number,title:string,
        completed:Boolean,
        )
        {
            this.title=title;
            this.completed=completed;
            this.userId=userId;
            this.id=id;
        }

}