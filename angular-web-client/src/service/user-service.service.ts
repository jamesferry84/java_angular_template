import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "../model/user";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private userUrl: string;

  constructor(private httpClient: HttpClient) {
    this.userUrl = 'http://localhost:8080/users';
  }

  public findAll(): Observable<User[]> {
    return this.httpClient.get<User[]>(this.userUrl);
  }

  public save(user: User) {
    return this.httpClient.post<User>(this.userUrl, user);
  }
}
