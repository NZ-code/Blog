import { Component } from '@angular/core';
import { DiscussionService } from '../discussion.service';
import { Discussion } from '../discussion';
@Component({
  selector: 'app-discussion-list',
  templateUrl: './discussion-list.component.html',
  styleUrls: ['./discussion-list.component.css']
})
export class DiscussionListComponent {
  discussions: Discussion[];

  constructor(private discussionService:DiscussionService){

  }
  ngOnInit(){
    this.discussionService.findAll().subscribe(
      data =>{
        this.discussions = data;
      }
    )
  }
}
