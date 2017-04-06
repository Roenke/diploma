final Map<String, VirtualFile> modules = StreamEx.
    of(PhpLibraryRoot.EP_NAME.getExtensions()).
    map(PhpLibraryRoot::getProvider).
    filter(PhpLibraryRootProvider::isRuntime).
    map(provider -> provider.getLibraryRoot(project)).
    flatMap(StreamEx::of).map(VirtualFile::getChildren).
    flatMap(Arrays::stream).filter(VirtualFile::isDirectory).
    remove(module -> module.getName().startsWith(".")).
    collect(Collectors
      .toMap(VirtualFile::getName, identity(), 
        (curr, next) -> next));

return modules.values().stream().
    filter(root -> root.findChild(".ignore") == null).
    collect(Collectors.toSet());