import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Professor } from 'src/app/core/entities/professor/professor';
import { ProfessorService } from 'src/app/core/entities/professor/professor.service';


@Injectable()
export class ProfessorResolver implements Resolve<Professor []> {

    constructor(private service: ProfessorService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}
