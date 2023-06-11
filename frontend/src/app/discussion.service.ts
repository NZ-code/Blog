import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Discussion } from './discussion';

@Injectable({
  providedIn: 'root'
})
export class DiscussionService {
  private discussionUrl : string;
  constructor(private http:HttpClient) {
    this.discussionUrl = "http://localhost:8080/discussions";
   }
   public findAll(): Observable<Discussion[]>{
    return this.http.get<Discussion[]>(this.discussionUrl);
  }
  public save(discussion:Discussion){
    return this.http.post<Discussion>(this.discussionUrl, discussion);
  }  
}
