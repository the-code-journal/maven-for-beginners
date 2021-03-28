package io.codejournal.maven.swagger2java;

import static java.util.Collections.singletonList;
import static io.codejournal.maven.swagger2java.model.Pet.StatusEnum.AVAILABLE;

import java.util.List;

import io.codejournal.maven.swagger2java.api.PetApi;
import io.codejournal.maven.swagger2java.model.Pet;


public class PetStoreRunner {

    public static void main(final String[] args) {

        final PetApi api = new PetApi();

        final List<Pet> petsByStatus = api.findPetsByStatus(singletonList(AVAILABLE.getValue()));

        petsByStatus.forEach(System.out::println);
    }
}
