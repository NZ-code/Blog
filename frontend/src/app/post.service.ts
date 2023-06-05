import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http'
import { Observable } from 'rxjs';
import { Post } from './post';

@Injectable({
  providedIn: 'root'
})
export class PostService {
  private postUrl :string;
  constructor(private http:HttpClient) { 
    this.postUrl = "http://localhost:8080/posts";
  }
  public findAll(): Observable<Post[]>{
    return this.http.get<Post[]>(this.postUrl);
  }
  public save(post : Post){
    return this.http.post<Post>(this.postUrl, post);
  }
}
