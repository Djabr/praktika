//
//  ContentView.swift
//  Shared
//
//  Created by Джабраил Хасбулатов on 18.12.2021.
//

import SwiftUI

struct ContentView: View {
    @Binding var document: hdsDocument

    var body: some View {
        TextEditor(text: $document.text)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView(document: .constant(hdsDocument()))
    }
}
